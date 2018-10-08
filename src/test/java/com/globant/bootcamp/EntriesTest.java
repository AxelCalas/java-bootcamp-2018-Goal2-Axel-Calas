package com.globant.bootcamp;

import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.junit.Assert.*;

public class EntriesTest { 
    
    @Test
    public void whenCreatedNewBlogThenListIsEmpty(){
        Blog blog = new Blog();
        assertTrue(blog.emptyList());
    }
    
    
    @Test 
    public void whenCreatedNewPostThenIsSavedInPostList(){
        Post mockPost = mock(Post.class);
        when(mockPost.getPost()).thenReturn("new post");
        
        Blog blog = new Blog();
        blog.newPost(mockPost);
        
        assertEquals("new post",blog.getPost(0));
    }
    
    @Test 
    public void maxSizeOfPostsListIsTen(){
        Blog blog = new Blog();
        Post mockPost = mock(Post.class);
        
        String post1to11 = "Post 1 al 11";
        int i;
        
        for(i=0 ; i<11 ; i++){
            when(mockPost.getPost()).thenReturn(post1to11);
            blog.newPost(mockPost);
        }
                
        assertEquals(10,blog.getSize());
    }
    
    @Test 
    public void whenAddAPostButTheListIsFullThenDeleteTheOldestPost() {
        Blog blog = new Blog();
        Post mockPost = mock(Post.class);
        
        String post3to11 = "Post 3 al 11";
        String post1 = "Post 1";
        String post2 = "Post 2";
        int i;
        
        when(mockPost.getPost()).thenReturn(post1);
        blog.newPost(mockPost);
        
        when(mockPost.getPost()).thenReturn(post2);
        blog.newPost(mockPost);
        
        for(i=0 ; i<9 ; i++){
            when(mockPost.getPost()).thenReturn(post3to11);
            blog.newPost(mockPost);
        }
                
        assertEquals(post2,blog.getPost(0));
    }
}
