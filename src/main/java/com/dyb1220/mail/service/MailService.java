package com.dyb1220.mail.service;

import java.util.List;


/**
 * @description 邮件功能接口
 * @author 码上就去学习
 * @date 2023/2/23 13:28
 * @version 1.0
 */
public interface MailService {



    /** 1
     * @description 发送简单文本邮件
     * @param mailRecipient  邮件接收方
     * @param subject  邮件主题
     * @param messageText  HTML格式的邮件文本内容
     */
    void sendSimpleMail(String mailRecipient,String subject ,String messageText);

    /** 2
     * @description 发送HTML格式邮件
     * @param mailRecipient 邮件接收方
     * @param subject 邮件主题
     * @param htmlText HTML格式的邮件文本内容
     */
    void sendHtmlMail(String mailRecipient,String subject , String  htmlText);


    /** 3
     * @description 发送包含附件的邮件
     * @param mailRecipient 邮件接收方
     * @param subject 邮件主题
     * @param messageText 邮件文本内容
     * @param filePathList 附件（文件路径集合）
     */
    void sendAppendixMail(String mailRecipient , String subject , String messageText , List<String> filePathList);
}
