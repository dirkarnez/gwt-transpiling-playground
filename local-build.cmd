@echo off
set PATH=^
%USERPROFILE%\Downloads\OpenJDK21U-jdk_x64_windows_hotspot_21.0.6_7\jdk-21.0.6+7\bin;^
%USERPROFILE%\Downloads\gwt-2.12.1;^
C:\hostedtoolcache\windows\Java_Temurin-Hotspot_jdk\21.0.6-7.0\x64\bin;

@REM webAppCreator.cmd
@REM @REM  
@REM java -cp gwt-dev.jar com.google.gwt.dev.Compiler compile com.example.MyEntryPoint
java -classpath "%~dp0;%USERPROFILE%\Downloads\gwt-2.12.1\gwt-2.12.1\*" com.google.gwt.dev.Compiler -saveSourceOutput -optimize -saveSource -logLevel ALL -includeJsInteropExports client.* -generateJsInteropExports -deploy deployment mymodule &&^
echo ok


@REM -[no]generateJsInteropExports] [-includeJsInteropExports
@REM  
