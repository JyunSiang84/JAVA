### P5 練習

#### 1. 變數宣告與初始化,基礎概念
```java
Copyint size = 27;                 // 宣告整數變數 size 並給予值 27
String name = "Fido";              // 宣告字串變數 name 並給予值 "Fido"
```

#### 2. 物件建立,物件導向概念
```java
CopyDog myDog = new Dog(name, size);   // 建立 Dog 類別的物件，並傳入名字和大小參數
```

#### 3. 數值運算與條件判斷
```java
Copyx = size - 5;                      // x = 27 - 5 = 22
if (x < 15) myDog.bark(8);             // 如果 x < 15，狗叫 8 次
                                       // (此處不會執行，因為 22 不小於 15)
```

#### 4. 迴圈控制
```java
Copywhile (x > 3) {                    // 當 x > 3 時執行
    myDog.play();                      // 狗狗進行遊戲
}                                      // 警告：這是無限迴圈，因為 x 值沒有改變
```

#### 5. 陣列操作
```java
Copyint[] numList = {2, 4, 6, 8};      // 宣告並初始化一個整數陣列，包含 4 個元素
```

#### 6. 輸出操作
```java
CopySystem.out.print("Hello");         // 輸出文字 "Hello"
System.out.print("Dog: " + name);      // 輸出 "Dog: " 加上狗的名字，結果為 "Dog: Fido"
```

#### 7. 型別轉換
```java
CopyString num = "8";                  // 宣告字串變數 num 並給予值 "8"
int z = Integer.parseInt(num);         // 將字串 "8" 轉換為整數 8
```

#### 8. 檔案處理與例外處理
```java
Copytry {
    readTheFile("myFile.txt");     // 嘗試讀取名為 "myFile.txt" 的檔案
} 
catch (FileNotFoundException ex) {  // 如果檔案不存在，捕捉例外
    System.out.print("File not found."); // 輸出錯誤訊息
}
```
