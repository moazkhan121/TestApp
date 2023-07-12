package com.usmanejaz.examapp;

public class Question {

   public int questionNo;
   public String question;
   public String status;
   public String correctAnswer;


   public Question(int questionNo, String question, String status, String correctAnswer){
      this.questionNo = questionNo;
      this.question = question;
      this.status = status;
      this.correctAnswer = correctAnswer;
   }
}
