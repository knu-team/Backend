package com.example.beday6.web.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class UpdateVersionRequestDto {
    private String osInfo;
    private String serviceVersion;
    private String serviceName;
    private boolean updateType;
    private String message;
    private String packageInfo;
}
