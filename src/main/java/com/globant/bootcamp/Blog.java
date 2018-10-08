package com.globant.bootcamp;

import java.util.ArrayList;

public class Blog {
    private ArrayList<String> postsList;
    static final int MAX_SIZE = 10;
    
    public Blog() {
        postsList = new ArrayList<String>();
    }
    
    public boolean emptyList() {
     /*  if(postsList == null || postsList.isEmpty()){
         return true;  
       } else {
           return false; 
         } */
        return postsList.isEmpty();   
    }
    
    public void newPost(Post postObj) {
        
        boolean errorDeletePost = true;
        
        if(postsList == null){
            postsList = new ArrayList<String>();
        } else if(postsList.size() == MAX_SIZE){
            errorDeletePost = deletePost(0);
        }
        
        if(errorDeletePost){
            String post = postObj.getPost();
            postsList.add(post);
        }
    }
    
    public boolean deletePost(int index) {
        boolean deleteConfirm = false;
        
        if(postsList.size() >= index){
            postsList.remove(index);
            deleteConfirm = true;
        } else {
            System.out.println("Error al borrar Post."); 
        }
        
        return deleteConfirm;
    }
    
    public void showEntries() {
        int i;
        for(i=0; i < postsList.size(); i++){
            String post = postsList.get(i);
            System.out.println(post + "\n");
        }
    }
    
    public String getPost(int numPost) {
        if(postsList.isEmpty()) {
            return "";
        } else if (numPost < 0 || numPost > postsList.size()) {
            return "ERROR: Post no encontrado";
        } else {
            return postsList.get(numPost);
        }
    }
    
    public int getSize(){
        return postsList.size();
    }
}
