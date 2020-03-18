package com.anujsingh.searchactivity;

public class ExampleItem {
 private int  mImageResources;
 private String mtext1;
 private String mtext2;

 public ExampleItem(int ImageResources,String text1,String text2){
     mImageResources = ImageResources;
     mtext1 = text1;
     mtext2 = text2;

 }

 public int getImageResource(){
     return mImageResources;
 }

 public String getText1(){
     return mtext1;
 }
 public String getText2(){
     return mtext2;
 }
}

