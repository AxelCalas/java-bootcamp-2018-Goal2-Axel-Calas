package com.globant.bootcamp;

public class App 
{  
    public static void main( String[] args )
    {   Post post = new Post();
        Blog blog = new Blog();
        blog.newPost(post);
        blog.newPost(post);
        blog.newPost(post);
        blog.showEntries();
        System.out.println ("Se borra el de pepe");
        boolean n = blog.deletePost(1);
        blog.showEntries();
    }
}
