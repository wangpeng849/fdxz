//package com.fii.fdxz.service;
//
//import com.fii.fdxz.mapper.StudentMapper;
//import com.fii.fdxz.pojo.po.RoleInfo;
//import com.fii.fdxz.pojo.po.StudentInfo;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.security.core.GrantedAuthority;
//import org.springframework.security.core.authority.SimpleGrantedAuthority;
//import org.springframework.security.core.userdetails.User;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.security.crypto.password.NoOpPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.lang.reflect.Array;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///**
// * @Author wangp
// * @Date 2020/5/26
// * @Version 1.0
// */
//@Service
//public class FdxzUserService implements UserDetailsService {
//
//    @Autowired
//    private StudentMapper studentMapper;
//
//
//    @Override
//    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
//        StudentInfo studentInfo = studentMapper.queryUserByStudyNumber(s);
//        List<GrantedAuthority> roles = new ArrayList<>();
//        RoleInfo roleInfo = studentMapper.queryRoleByStudentId(studentInfo.getId());
//        roles.add(new SimpleGrantedAuthority(roleInfo.getRoleCode()));
//        return new User(studentInfo.getStudyNumber(),studentInfo.getPassword(),roles);
//    }
//}
