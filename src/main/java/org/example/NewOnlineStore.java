package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.util.List;

public class NewOnlineStore extends Utils {
    static String title_new;
    static String comment_new;
    String titleCheck;
    String commentCheck;
    String lastComment;


    public void enterComment() throws InterruptedException, IOException {
        readProperty();
        title_new = title;
        comment_new = comment;
        clickOnElement(By.xpath("//a[normalize-space()='New online store is open!']"));
        Thread.sleep(2000);
        waitForClickable(By.className("enter-comment-title"),5000);
        enterText(By.className("enter-comment-title"), title);
        waitForClickable(By.className("enter-comment-text"),5000);
        enterText(By.className("enter-comment-text"),comment);
        waitForClickable(By.cssSelector("button[name='add-comment']"),5000);
        clickOnElement(By.cssSelector("button[name='add-comment']"));


    }
    public void commentSuccess(){
        //checking commend added successfully
        String expectedSuccessText = "News comment is successfully added.";
        String successTextActual = getTextFromElement(By.cssSelector("div[class='result']"));
        // success check
        Assert.assertEquals(successTextActual,expectedSuccessText, "Your test case is failed");
    }
    public void verifyAddedComment(){
        List<WebElement> comments = driver.findElements(By.xpath("//div[@class='comments']/div"));
        int eleSize = comments.size();
        System.out.println("number of comments found :" + eleSize);

        //getting last comment
        lastComment = comments.get(eleSize-1).getText();
        System.out.println("Last comment found in element is: "+ lastComment);

        System.out.println("Actual title inserted :" + title_new);
        System.out.println("Actual comment inserted :" + comment_new);

        //checking last comment against inserted values i.e. title and comments
        boolean reslt1 = lastComment.contains(title_new);
        boolean reslt2 = lastComment.contains(comment_new);

        //System.out.println(driver.findElement(By.xpath("//div[@class='comments']/div["+eleSize+"]")).getText());

        Assert.assertTrue(reslt1);
        Assert.assertTrue(reslt2);

    }


}
