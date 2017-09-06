package com.llw.ssm.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import java.io.File;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class UploadController {
    private static Logger logger = Logger.getLogger(UploadController.class);
    @RequestMapping("upload")
    public String upload(HttpServletRequest request, HttpServletResponse response) {
        Long start = System.currentTimeMillis();
        MultipartHttpServletRequest mRequest = (MultipartHttpServletRequest) request;
        MultipartFile file = mRequest.getFile("file");
        if(file != null) {
            //取得当前上传文件的文件名称
            String myFileName = file.getOriginalFilename();
            //如果名称不为“”,说明该文件存在，否则说明该文件不存在
            if (myFileName.trim() != "") {
                System.out.println(myFileName);
                //重命名上传后的文件名
                String fileName = "demoUpload" + file.getOriginalFilename();
                //定义上传路径
                String path = "D:/" + fileName;
                File localFile = new File(path);
                try {
                    file.transferTo(localFile);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                Long end = System.currentTimeMillis();
                logger.info("Time:" + (end - start));
            }
        }
        return "/success";
    }
}
