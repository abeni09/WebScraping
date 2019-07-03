package com.company;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.sql.SQLException;

public class WaltaInfo {



    public static void main(String[] args) throws SQLException, IOException {
        //WaltaInfo();
        News();
        Sport();
        Business();

    }
     static void Sport() throws IOException, SQLException {
        DatabaseAndDriver dd = new DatabaseAndDriver();
        String url="http://www.waltainfo.com/index.php/EASport";
        dd.driver.navigate().to(url);
        String SImgSrc=dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div[2]/p[1]/img")).getAttribute("src");
        String sportdatee =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String sporttitle = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String sportdetail = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String sportimagePath="images/WaltaInfo/WaltaSnews.jpg";
        BufferedImage sportimage;

        URL sursl =new URL(SImgSrc);
        sportimage = ImageIO.read(sursl);
        String sextension="";
        int slen=SImgSrc.length();
        char[] schars=SImgSrc.toCharArray();

        int si=0;
        while (si<3) {
            sextension= sextension + schars[slen - 1];
            slen--;
            si++;
        }

        if(sextension.equals("png")) ImageIO.write(sportimage, sextension, new File(sportimagePath + sextension));

        else if(sextension.equals("jpg")) ImageIO.write(sportimage, sextension, new File(sportimagePath + sextension));

        else ImageIO.write(sportimage, sextension, new File(sportimagePath + sextension));

        System.out.println(sporttitle);
        System.out.println("\n");
        System.out.println(sportdetail);
        //driver.quit();
        dd.preparedStmtSports.setString(1, sporttitle);
        dd.preparedStmtSports.setString(2, sportdetail);
        dd.preparedStmtSports.setString(3, sportdatee);
        dd.preparedStmtSports.setString(4, url);
        dd.preparedStmtSports.setString(5, sportimagePath);
        dd.preparedStmtSports.execute();
        System.out.println("Successfully entered to the DB");
        //dd.connection.close();

        String SImgSrc2=dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String sportdatee2 =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String sporttitle2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String sportdetail2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String sportimagePath2="images/WaltaInfo/WaltaSnews2.jpg";
        BufferedImage sportimage2;

        URL sursl2 =new URL(SImgSrc2);
        sportimage2 = ImageIO.read(sursl2);
        String sextension2="";
        int slen2=SImgSrc2.length();
        char[] schars2=SImgSrc2.toCharArray();

        int si2=0;
        while (si2<3) {
            sextension2= sextension2 + schars2[slen2 - 1];
            slen2--;
            si2++;
        }

        if(sextension2.equals("png")) ImageIO.write(sportimage2, sextension2, new File(sportimagePath2 + sextension2));

        else if(sextension2.equals("jpg")) ImageIO.write(sportimage2, sextension2, new File(sportimagePath2 + sextension2));

        else ImageIO.write(sportimage2, sextension2, new File(sportimagePath2 + sextension2));

        System.out.println(sporttitle2);
        System.out.println("\n");
        System.out.println(sportdetail2);
        //driver.quit();
        dd.preparedStmtSports.setString(1, sporttitle2);
        dd.preparedStmtSports.setString(2, sportdetail2);
        dd.preparedStmtSports.setString(3, sportdatee2);
        dd.preparedStmtSports.setString(4, url);
        dd.preparedStmtSports.setString(5, sportimagePath2);
        dd.preparedStmtSports.execute();
        System.out.println("Successfully entered to the DB");
        //dd.connection.close();

        dd.driver.navigate().back();
        String SImgSrc3=dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String sportdatee3 =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String sporttitle3 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String sportdetail3 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String sportimagePath3="images/WaltaInfo/WaltaSnews3.jpg";
        BufferedImage sportimage3;

        URL sursl3 =new URL(SImgSrc3);
        sportimage3 = ImageIO.read(sursl3);
        String sextension3="";
        int slen3=SImgSrc3.length();
        char[] schars3=SImgSrc3.toCharArray();

        int si3=0;
        while (si3<3) {
            sextension3= sextension3 + schars3[slen3 - 1];
            slen3--;
            si3++;
        }

        if(sextension3.equals("png")) ImageIO.write(sportimage3, sextension3, new File(sportimagePath3 + sextension3));

        else if(sextension3.equals("jpg")) ImageIO.write(sportimage3, sextension3, new File(sportimagePath3 + sextension3));

        else ImageIO.write(sportimage3, sextension3, new File(sportimagePath3 + sextension3));

        System.out.println(sporttitle3);
        System.out.println("\n");
        System.out.println(sportdetail3);
        //driver.quit();
        dd.preparedStmtSports.setString(1, sporttitle3);
        dd.preparedStmtSports.setString(2, sportdetail3);
        dd.preparedStmtSports.setString(3, sportdatee3);
        dd.preparedStmtSports.setString(4, url);
        dd.preparedStmtSports.setString(5, sportimagePath3);
        dd.preparedStmtSports.execute();
        System.out.println("Successfully entered to the DB");
        //dd.connection.close();

    }
     static void Business() throws IOException, SQLException {
        DatabaseAndDriver dd = new DatabaseAndDriver();
        String url = "http://www.waltainfo.com/index.php/news/business";
        dd.driver.navigate().to(url);
        String BImgSrc=dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div[1]/div/div[2]/p[1]/img")).getAttribute("src");
        String businessdatee =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String businesstitle = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String businessdetail = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String businessimagePath="images/WaltaInfo/WaltaBnews.";
        BufferedImage buisnessimage;

        URL bursl =new URL(BImgSrc);
        buisnessimage = ImageIO.read(bursl);
        String bextension="";
        int blen=BImgSrc.length();
        char[] bchars=BImgSrc.toCharArray();

        int bi=0;
        while (bi<3) {
            bextension= bextension + bchars[blen - 1];
            blen--;
            bi++;
        }

        if(bextension.equals("png")) ImageIO.write(buisnessimage, bextension, new File(businessimagePath + bextension));

        else if(bextension.equals("jpg")) ImageIO.write(buisnessimage, bextension, new File(businessimagePath + bextension));

        else ImageIO.write(buisnessimage, bextension, new File(businessimagePath + bextension));

        System.out.println(businesstitle);
        System.out.println("\n");
        System.out.println(businessdetail);
        //driver.quit();
        dd.preparedStmtBusiness.setString(1, businesstitle);
        dd.preparedStmtBusiness.setString(2, businessdetail);
        dd.preparedStmtBusiness.setString(3, businessdatee);
        dd.preparedStmtBusiness.setString(4, url);
        dd.preparedStmtBusiness.setString(5, businessimagePath);
        dd.preparedStmtBusiness.execute();
        System.out.println("Successfully entered to the DB");
        //dd.connection.close();

        String BImgSrc2=dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[1]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String businessdatee2 =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String businesstitle2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String businessdetail2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String businessimagePath2="images/WaltaInfo/WaltaBnews2.";
        BufferedImage buisnessimage2;

        URL bursl2 =new URL(BImgSrc2);
        buisnessimage2 = ImageIO.read(bursl2);
        String bextension2="";
        int blen2=BImgSrc2.length();
        char[] bchars2=BImgSrc2.toCharArray();

        int bi2=0;
        while (bi2<3) {
            bextension2= bextension2 + bchars2[blen2 - 1];
            blen2--;
            bi2++;
        }

        if(bextension2.equals("png")) ImageIO.write(buisnessimage2, bextension2, new File(businessimagePath2 + bextension2));

        else if(bextension2.equals("jpg")) ImageIO.write(buisnessimage2, bextension2, new File(businessimagePath2 + bextension2));

        else ImageIO.write(buisnessimage2, bextension2, new File(businessimagePath2 + bextension2));


        System.out.println(businesstitle2);
        System.out.println("\n");
        System.out.println(businessdetail2);
        //driver.quit();
        dd.preparedStmtBusiness.setString(1, businesstitle2);
        dd.preparedStmtBusiness.setString(2, businessdetail2);
        dd.preparedStmtBusiness.setString(3, businessdatee2);
        dd.preparedStmtBusiness.setString(4, url);
        dd.preparedStmtBusiness.setString(5, businessimagePath2);
        dd.preparedStmtBusiness.execute();
        System.out.println("Successfully entered to the DB");
        //dd.connection.close();

        dd.driver.navigate().back();

        String BImgSrc3=dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div[2]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String businessdatee3 =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String businesstitle3 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String businessdetail3 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String businessimagePath3="images/WaltaInfo/WaltaBnews3.";
        BufferedImage buisnessimage3;

        URL bursl3 =new URL(BImgSrc3);
        buisnessimage3 = ImageIO.read(bursl3);
        String bextension3="";
        int blen3=BImgSrc3.length();
        char[] bchars3=BImgSrc3.toCharArray();

        int bi3=0;
        while (bi3<3) {
            bextension3= bextension3 + bchars3[blen3 - 1];
            blen3--;
            bi3++;
        }

        if(bextension3.equals("png")) ImageIO.write(buisnessimage3, bextension3, new File(businessimagePath3 + bextension3));

        else if(bextension3.equals("jpg")) ImageIO.write(buisnessimage3, bextension3, new File(businessimagePath3 + bextension3));

        else ImageIO.write(buisnessimage3, bextension3, new File(businessimagePath3 + bextension3));

        System.out.println(businesstitle3);
        System.out.println("\n");
        System.out.println(businessdetail3);
        //driver.quit();
        dd.preparedStmtBusiness.setString(1, businesstitle3);
        dd.preparedStmtBusiness.setString(2, businessdetail3);
        dd.preparedStmtBusiness.setString(3, businessdatee3);
        dd.preparedStmtBusiness.setString(4, url);
        dd.preparedStmtBusiness.setString(5, businessimagePath3);
        dd.preparedStmtBusiness.execute();
        System.out.println("Successfully entered to the DB");
        dd.connection.close();
        dd.driver.quit();

    }
     static void News() throws SQLException {
        DatabaseAndDriver dd = new DatabaseAndDriver();
        String url = " http://www.waltainfo.com/index.php";
        dd.driver.get(url);


        String ImgSrc=dd.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[1]/div/div[3]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[1]/div/div[3]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String datee = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String title = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String detail = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String imagePath="images/WaltaInfo/Waltanews.";
        BufferedImage image;

        String extension="";
        int len=ImgSrc.length();
        char[] chars=ImgSrc.toCharArray();

        int i=0;
        while (i<3) {
           extension= extension + chars[len - 1];
           len--;
           i++;
        }


        URL ursl = null;
        try {
           ursl = new URL(ImgSrc);
           image = ImageIO.read(ursl);
           if(extension.equals("png")) ImageIO.write(image, extension, new File(imagePath + extension));

           else if(extension.equals("jpg")) ImageIO.write(image, extension, new File(imagePath + extension));

           else if(extension.equals("gif")) ImageIO.write(image, extension, new File(imagePath + extension));

           else ImageIO.write(image, extension, new File(imagePath + extension));
        }
        catch (MalformedURLException e) {
           e.printStackTrace();
        }catch (IOException e) {
             e.printStackTrace();
           try {
              image=ImageIO.read(new File("alternative.jpeg"));
           } catch (IOException ex) {
              ex.printStackTrace();
           }
        }



        System.out.println(title);
        System.out.println("\n");
        System.out.println(detail);

        dd.preparedStmtNews.setString(1, title);
        dd.preparedStmtNews.setString(2, detail);
        dd.preparedStmtNews.setString(3, datee);
        dd.preparedStmtNews.setString(4, url);
        dd.preparedStmtNews.setString(5, imagePath);
        dd.preparedStmtNews.execute();
        System.out.println("Successfully entered to the DB");
        //connection.close();
        dd.driver.navigate().back();

        String ImgSrc2=dd.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/div/div[4]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[2]/div/div[4]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String datee2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String title2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String detail2 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String imagePath2="images/WaltaInfo/Waltanews2.jpg";
        BufferedImage image2;

        String extension2="";
        int len2=ImgSrc2.length();
        char[] chars2=ImgSrc2.toCharArray();

        int i2=0;
        while (i2<3) {
           extension2= extension2 + chars2[len2 - 1];
           len2--;
           i2++;
        }


        URL ursl2 = null;
        try {
           ursl2 = new URL(ImgSrc2);
           image2 = ImageIO.read(ursl2);
           if(extension2.equals("png")) ImageIO.write(image2, extension2, new File(imagePath2 + extension2));

           else if(extension2.equals("jpg")) ImageIO.write(image2, extension2, new File(imagePath2 + extension2));

           else if(extension2.equals("gif")) ImageIO.write(image2, extension2, new File(imagePath2 + extension2));

           else ImageIO.write(image2, extension2, new File(imagePath2 + extension2));
        }
        catch (MalformedURLException e) {
           e.printStackTrace();
        }catch (IOException e) {
           e.printStackTrace();
           try {
              image2=ImageIO.read(new File("alternative.jpeg"));
           } catch (IOException ex) {
              ex.printStackTrace();
           }
        }



        System.out.println(title2);
        System.out.println("\n");
        System.out.println(detail2);
        //driver.quit();
        dd.preparedStmtNews.setString(1, title2);
        dd.preparedStmtNews.setString(2, detail2);
        dd.preparedStmtNews.setString(3, datee2);
        dd.preparedStmtNews.setString(4, url);
        dd.preparedStmtNews.setString(5, imagePath2);
        dd.preparedStmtNews.execute();
        System.out.println("Successfully entered to the DB");
        //connection.close();

        dd.driver.navigate().back();

        String ImgSrc3=dd.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[3]/div/div[3]/div[1]/a/img")).getAttribute("src");
        dd.driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div[3]/div/div[3]/div[2]/p[1]/a")).sendKeys(Keys.ENTER);
        String datee3 =dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[1]/span[2]")).getText();
        String title3 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/h4")).getText();
        String detail3 = dd.driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[1]/div/div/div/div[2]")).getText();
        String imagePath3="images/WaltaInfo/Waltanews3.jpg";
        BufferedImage image3;

        String extension3="";
        int len3=ImgSrc3.length();
        char[] chars3=ImgSrc3.toCharArray();

        int i3=0;
        while (i3<3) {
           extension3= extension3 + chars3[len3 - 1];
           len3--;
           i3++;
        }


        URL ursl3 = null;
        try {
           ursl3 = new URL(ImgSrc3);
           image3 = ImageIO.read(ursl3);
           if(extension3.equals("png")) ImageIO.write(image3, extension3, new File(imagePath3 + extension3));

           else if(extension3.equals("jpg")) ImageIO.write(image3, extension3, new File(imagePath3 + extension3));

           else if(extension3.equals("gif")) ImageIO.write(image3, extension3, new File(imagePath3 + extension3));

           else ImageIO.write(image3, extension3, new File(imagePath3 + extension3));
        }
        catch (MalformedURLException e) {
           e.printStackTrace();
        }catch (IOException e) {
           e.printStackTrace();
           try {
              image3=ImageIO.read(new File("alternative.jpeg"));
           } catch (IOException ex) {
              ex.printStackTrace();
           }
        }



        System.out.println(title3);
        System.out.println("\n");
        System.out.println(detail3);
        //driver.quit();
        dd.preparedStmtNews.setString(1, title3);
        dd.preparedStmtNews.setString(2, detail3);
        dd.preparedStmtNews.setString(3, datee3);
        dd.preparedStmtNews.setString(4, url);
        dd.preparedStmtNews.setString(5, imagePath3);
        dd.preparedStmtNews.execute();
        System.out.println("Successfully entered to the DB");
        //dd.connection.close();
        //dd.driver.quit();


    }
}

