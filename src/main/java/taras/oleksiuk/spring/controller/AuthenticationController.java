package taras.oleksiuk.spring.controller;

import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import taras.oleksiuk.spring.dto.request.UserRequestDto;
import taras.oleksiuk.spring.dto.response.UserResponseDto;
import taras.oleksiuk.spring.model.User;
import taras.oleksiuk.spring.service.AuthenticationService;
import taras.oleksiuk.spring.service.mapper.UserMapper;

@RestController
public class AuthenticationController {
    private final AuthenticationService authService;
    private final UserMapper userMapper;

    public AuthenticationController(AuthenticationService authService, UserMapper userMapper) {
        this.authService = authService;
        this.userMapper = userMapper;
    }

    @PostMapping("/register")
    public UserResponseDto register(@RequestBody @Valid UserRequestDto requestDto) {
        User user = authService.register(requestDto.getEmail(),
                requestDto.getPassword());
        return userMapper.mapToDto(user);
    }

    @GetMapping("/")
    public String greeting() {
        return "You are welcome!";
    }
}
