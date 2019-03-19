package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@RequestMapping("/file")
public class FileCtrl {
    @RequestMapping("/show")
    public String show(){
        return "upload";
    }

    /*注意：因为传来的参数默认是String,所以为了转换为下面的参数类型，添加Requestparam
    * CommonsMultipartFile[] file
    * */
    @RequestMapping("/upload")
    public String up(@RequestParam("file") CommonsMultipartFile file, HttpSession session) throws IOException {
        System.out.println("文件名："+file.getName()+",originalName:"+file.getOriginalFilename()+"," +
                "类型："+file.getContentType()+",大小:"+file.getSize());
        //file.transferTo(new File("d:/1.txt"));
        String path = session.getServletContext().getRealPath("/upload/"+new SimpleDateFormat("yyyyMMdd").format(new Date()));
        System.out.println("path:"+path);
        File f = new File(path);
        f.mkdirs();
        file.transferTo(new File(f,file.getOriginalFilename()));
        return "redirect:/file/show";
    }

}
