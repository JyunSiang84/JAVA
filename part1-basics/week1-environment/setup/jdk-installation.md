# JDK 安裝指南
JDK（Java Development Kit）是開發Java應用程序的核心工具包，讓我來詳細為您解釋。
想像您要蓋一棟房子，您需要完整的工具箱，裡面有鎚子、螺絲起子、水平尺等工具。JDK就像是開發Java程序的完整工具箱，裡面包含了所有需要的開發工具。
JDK主要包含三個重要組件：
1. Java編譯器（javac）：
這就像是一位翻譯官，它可以將我們寫的Java源代碼（.java文件）轉換成Java虛擬機可以理解的字節碼（.class文件）。就像把我們的中文翻譯成機器能理解的語言。
2. Java運行環境（JRE）：
這是Java程序的運行平台，包含了Java虛擬機（JVM）。可以把JVM想像成一個特殊的容器，它能在不同的操作系統上統一運行Java程序。這就是為什麼我們常說"Java是跨平台的"——無論是Windows、Mac還是Linux，只要安裝了JRE，Java程序就能運行。
3. Java API（應用程序接口）：
這是一個龐大的預製組件庫，就像是樂高積木一樣。開發者不需要從零開始寫所有功能，可以直接使用這些現成的組件來構建應用程序，比如處理文件、網絡通信、圖形界面等。

## Windows 安裝步驟
1. 訪問 Oracle 官方網站下載 JDK( JDK Development Kit 23.0.1 downloads )
2. 下載適合的版本（建議 JDK 17 LTS）
3. 安裝步驟：
   - 執行下載的安裝檔
   - 選擇安裝路徑
   - 完成安裝

## 環境變數設置
1. 設置 JAVA_HOME
   - 搜尋 [編輯系統環境變數]
   - 新增系統變數 JAVA_HOME：C:\Program Files\Java\jdk-23

2. 設置 Path
   - 編輯 Path 變數
   - 新增 %JAVA_HOME%\bin

## 驗證安裝
開啟命令提示字元，輸入：
```java -version```
應該看到類似輸出：
```
openjdk 21.0.5 2024-10-15 LTS
OpenJDK Runtime Environment Temurin-21.0.5+11 (build 21.0.5+11-LTS)
OpenJDK 64-Bit Server VM Temurin-21.0.5+11 (build 21.0.5+11-LTS, mixed mode, sharing)
```
