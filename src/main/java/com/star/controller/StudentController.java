package com.star.controller;

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
import org.springframework.context.ApplicationContextAware;
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
    @GetMapping("list")
    List<Student> findById(HttpServletResponse response) {
        return studentService.all();
    }

    @GetMapping("add")
    //@RequiresPermissions("student:add")
   Ret add(HttpServletResponse response) {
        System.out.println("add操作");
        return Ret.ok().set("msg","add");
    }
    @GetMapping("view")
    //@RequiresPermissions("student:add")
   Ret view(HttpServletResponse response) {
        System.out.println("view");
        return Ret.ok().set("msg","view");
    }
    @GetMapping("all")
    Ret all(){
        List<Record> list=studentService.findAll();
        return Ret.ok().set("studentlist",list);
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
}
