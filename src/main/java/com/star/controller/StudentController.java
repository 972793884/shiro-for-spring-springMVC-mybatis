package com.star.controller;

import com.star.Utils.PageUtils;
import com.star.Utils.Record;
import com.star.Utils.Ret;
import com.star.Utils.SpringUtil;
import com.star.service.Impl.ShiroServiceImpl;
import com.star.service.StudentService;
import com.star.vo.Student;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.spring.web.ShiroFilterFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContextAware;
import org.springframework.ui.ModelMap;
import org.springframework.util.ClassUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Map;

@RequestMapping("student")
@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;
    @Autowired
    ShiroServiceImpl shiroService;
    @Autowired
    PageUtils pageUtils;

    //学生查询列表   参数  name  age  page  pageSize
    @GetMapping("list")
    PageUtils findById(HttpServletResponse response, @RequestParam("name") String name, @RequestParam("age") Integer age, @RequestParam("page") Integer page, @RequestParam("pageSize") Integer pageSize) {
         pageUtils.setPageList(studentService.all(name,age),page==null?1:page,pageSize);
        return pageUtils;
    }



    @GetMapping("add")
        //@RequiresPermissions("student:add")
    Ret save(HttpServletResponse response,Student student) {
        Integer result = studentService.save(student);
        return Ret.ok().set("msg", "add");
    }

    @GetMapping("view")
        //@RequiresPermissions("student:add")
    Ret view(HttpServletResponse response) {
        System.out.println("view");
        return Ret.ok().set("msg", "view");
    }

    @GetMapping("all")
    Ret all() {
        List<Record> list = studentService.findAll();
        return Ret.ok().set("studentlist", list);
    }

    @GetMapping("updatePermission")
    Ret reload(HttpServletResponse response) {
        ShiroFilterFactoryBean shiroFilterFactoryBean = SpringUtil.getBean(ShiroFilterFactoryBean.class);
        shiroService.updatePermission(shiroFilterFactoryBean);
        return Ret.ok().set("msg", "资源权限更新成功!!");
    }

    @PostMapping("upload")
    Ret upload(@RequestParam("myFile") MultipartFile file, HttpServletRequest request) throws FileNotFoundException {
        if (!file.isEmpty()) {
            String saveFileName = file.getOriginalFilename();
            String path = ResourceUtils.getURL("classpath:").getPath();
            File saveFile = new File(path + "/upload/" + saveFileName);
            if (!saveFile.getParentFile().exists()) {
                saveFile.getParentFile().mkdirs();
            }
            try {
                BufferedOutputStream out = new BufferedOutputStream(new FileOutputStream(saveFile));
                out.write(file.getBytes());
                out.flush();
                out.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return Ret.ok();
    }









































    @PostMapping("package")
    Ret test() throws InterruptedException {
        String str = "sh /usr/app/start.sh";
        System.out.println("执行脚本");
        build(str);
        return Ret.ok();
    }
    @GetMapping("package")
    Ret test2() throws InterruptedException {
        String str = "sh /usr/app/start.sh";
        System.out.println("执行脚本");
        build(str);
        return Ret.ok();
    }
    Ret build(String str) throws InterruptedException {
        Process p = null;
        try {
            System.out.println("--------------------开始执行--------------------------");
            p = Runtime.getRuntime().exec(str);
            InputStream inputStream = p.getInputStream();
            byte[] data = new byte[800];
            while ((inputStream.read(data, 0, data.length)) != -1) {
                System.out.println(new String(data));
            }

            InputStream e = p.getErrorStream();
            while ((e.read(data, 0, data.length - 1)) != -1) {
                System.out.println(new String(data));
            }
            p.getOutputStream().close();
            p.getInputStream().close();
            p.getErrorStream().close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (p != null) {
                p.waitFor();
            }
            p.destroy();
            System.out.println("--------------------执行完毕--------------------------");
        }
        return Ret.ok();
    }

}
