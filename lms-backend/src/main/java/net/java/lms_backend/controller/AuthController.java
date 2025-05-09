package net.java.lms_backend.controller;


import net.java.lms_backend.Service.AuthService;
import net.java.lms_backend.dto.LoginRequestDTO;
import net.java.lms_backend.dto.RegisterDTO;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.*;

import static net.java.lms_backend.mapper.UserMapper.ToUserLogin;

@RestController
@RequestMapping(path = "api/auth")
public class AuthController {

    private final AuthService authService;

//    private final JwtUtil jwtUtil;

    public AuthController(AuthService authService) {
        this.authService = authService;
//        this.jwtUtil = jwtUtil;
    }

    @PostMapping("login")
    public ResponseEntity<String> login(@RequestBody LoginRequestDTO loginRequest) {

       /* Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword())
        
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String token = jwtUtil.generateToken(loginRequest.getUsername());
        return ResponseEntity.ok(token);*/
        return authService.login( ToUserLogin(loginRequest));
    }

    @PostMapping("register")
    public ResponseEntity<String> register(@RequestBody RegisterDTO user) {
        return authService.register(user);
    }

    @GetMapping(path = "confirm")
    public ResponseEntity<String> confirm(@RequestParam("token") String token) {
        return authService.confirmToken(token);
    }
}
