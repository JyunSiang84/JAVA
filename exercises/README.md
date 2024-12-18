# Java 練習題集

## Level 1：基礎練習

### A. 變數與運算
#### A1. 基本計算
1. 計算機程式
   - 輸入：兩個整數
   - 功能：加減乘除運算
   - 要求：處理除以零的情況
   
2. 溫度轉換程式
   - 輸入：攝氏或華氏溫度
   - 功能：溫度單位轉換
   - 輸出：轉換後的溫度

3. BMI 計算器
   - 輸入：身高(公尺)、體重(公斤)
   - 功能：計算 BMI 值
   - 輸出：體重狀態判定

#### A2. 字串處理
1. 字串反轉程式
   - 輸入：一串文字
   - 功能：反轉字串
   - 要求：處理空字串情況

2. 文字統計程式
   - 功能：計算字串長度
   - 功能：統計字母、數字、空格數量
   - 功能：大小寫轉換

### B. 流程控制
#### B1. 條件判斷
1. 成績等級判定
   - 輸入：0-100 分數
   - 輸出：A、B、C、D、F 等級
   - 要求：驗證輸入範圍

2. 閏年判斷程式
   - 輸入：年份
   - 功能：判斷閏年
   - 輸出：判斷結果與說明

#### B2. 迴圈應用
1. 乘法表程式
   - 功能：產生九九乘法表
   - 功能：自訂範圍乘法表
   - 要求：格式化輸出

2. 猜數字遊戲
   - 功能：產生 1-100 隨機數
   - 功能：提供猜測與提示
   - 紀錄：統計猜測次數

### C. 陣列應用
1. 基礎操作
   - 建立陣列
   - 存取資料
   - 修改內容

2. 統計運算
   - 計算平均值
   - 找出最大/最小值
   - 計算標準差

3. 陣列排序
   - 氣泡排序法
   - 選擇排序法
   - 比較排序效率

## Level 2：進階練習

### A. 物件導向
1. 圖書館系統
```java
class Book {
    private String title;
    private String author;
    private String isbn;
    
    // 建構子
    // getter/setter
    // 其他方法
}

class Library {
    private List<Book> books;
    // 借書方法
    // 還書方法
}
```
2. 銀行帳戶系統
```java
class Account {
    private String accountNumber;
    private double balance;
    
    // 存款方法
    // 提款方法
}
```
### B. 檔案處理
1. 基本檔案操作
   - 建立文字檔
   - 讀取內容
   - 寫入資料
   - 例外處理

2. 資料驗證
   - 電子郵件格式
   - 手機號碼格式
   - 自訂例外類別

## Level 3：專題練習
## A. 學生成績管理系統
### A1. 功能需求
1. 學生資料管理
   - 新增學生基本資料（學號、姓名、班級）
   - 修改學生資料
   - 刪除學生資料
   - 查詢學生資料

2. 成績管理功能
   - 輸入各科成績（國文、英文、數學、自然、社會）
   - 修改成績記錄
   - 刪除成績記錄
   - 查詢個人成績

3. 成績計算功能
   - 計算總分
   - 計算平均分數
   - 各科及格率統計
   - 全班平均計算

4. 排名統計功能
   - 依總分排名
   - 依單科成績排名
   - 各分數級距人數統計
   - 繪製成績分布圖

5. 資料管理功能
   - 資料儲存至檔案
   - 讀取檔案資料
   - 成績單匯出功能
   - 資料備份功能

### A2.技術重點
1. 類別設計
```java
class Student {
    private String id;
    private String name;
    private String className;
    private Map<String, Integer> scores;
    // getter/setter 與其他方法
}

class ScoreManager {
    private List<Student> students;
    // 成績管理相關方法
}
```

2. 檔案處理
  - 使用 CSV 或 JSON 格式儲存
  - 實作檔案讀寫功能
  - 處理檔案異常狀況
3. 使用者介面
  - 提供選單操作
  - 資料輸入驗證
  - 結果格式化輸出

## B. 個人記帳本系統

### B1. 基本資料結構
```java
// 交易紀錄類別
class Transaction {
   private String id;          // 交易編號
   private Date date;          // 交易日期
   private TransactionType type;    // 收入/支出
   private Category category;  // 交易分類
   private double amount;      // 金額
   private String description; // 描述
   private PaymentMethod paymentMethod; // 付款方式
}

// 分類類別
class Category {
   private String id;          // 分類編號
   private String name;        // 分類名稱
   private CategoryType type;  // 收入/支出分類
   private String description; // 分類描述
}

// 付款方式類別
class PaymentMethod {
   private String id;          // 付款方式編號
   private String name;        // 付款方式名稱
   private PaymentType type;   // 現金/信用卡/轉帳
}
```
### B2. 核心功能模組
#### B2-1. 收支記錄管理
1. 新增交易紀錄
   - 選擇收入/支出
   - 選擇交易分類
   - 輸入金額與說明
   - 選擇付款方式
   - 設定交易日期

2. 修改交易紀錄
   - 查詢特定交易
   - 修改交易內容
   - 更新交易資訊

3. 刪除交易紀錄
   - 單筆刪除
   - 批次刪除
   - 刪除確認機制

4. 查詢交易紀錄
   - 依日期查詢
   - 依分類查詢
   - 依金額範圍查詢
   - 依付款方式查詢

#### B2-2. 分類管理功能
1. 收入分類
   - 薪資收入
   - 投資收入
   - 其他收入

2. 支出分類
   - 食品支出
   - 交通支出
   - 居住支出
   - 娛樂支出
   - 醫療支出
   - 其他支出

3. 分類設定
   - 新增自訂分類
   - 修改分類內容
   - 刪除未使用分類
   - 分類排序管理

#### B2-3. 統計分析功能
1. 時間維度分析
   - 日收支統計
   - 週收支統計
   - 月收支統計
   - 年收支統計
   - 自訂期間統計

2. 分類維度分析
   - 收入分類統計
   - 支出分類統計
   - 收支比例分析
   - 分類趨勢分析

3. 圖表視覺化
   - 收支折線圖
   - 分類圓餅圖
   - 趨勢長條圖
   - 收支對比圖

#### B2.4 預算管理功能
1. 預算設定
   - 月度總預算
   - 分類預算
   - 週期性預算

2. 預算追蹤
   - 預算使用進度
   - 預算警示通知
   - 預算達成分析

3. 預算報表
   - 預算執行報表
   - 預算差異分析
   - 預算調整建議

##### B2.5 資料管理功能
1. 資料儲存
   - 本地檔案儲存
   - 自動備份機制
   - 資料加密保護

2. 資料匯出
   - CSV格式匯出
   - Excel格式匯出
   - 自訂範本匯出

3. 報表產生
   - 月度收支報表
   - 年度收支報表
   - 預算分析報表
   - 自訂報表格式

### B3. 進階功能
#### B3-1. 智能分析
   - 消費習慣分析
   - 異常交易提醒
   - 節省建議生成
   - 理財目標追蹤

#### B3-2. 備忘錄功能
   - 定期支出提醒
   - 帳單繳費提醒
   - 重要記事備註

#### B3-3. 多元幣別
   - 幣別轉換功能
   - 匯率即時更新
   - 多幣別報表

### B4. 專案驗收重點
#### B4-1.功能完整性
   - 基本功能實現
   - 操作流程順暢
   - 異常處理完善

#### B4-2.資料正確性
   - 計算準確無誤
   - 資料一致性
   - 查詢結果正確

#### B4-3.使用者體驗
   - 界面易操作
   - 響應速度快
   - 操作流程直覺

#### B4-4.程式碼品質
   - 結構清晰
   - 命名規範
   - 註解完整
   - 適當重構

### B5. 學習重點
#### B5-1. Java基礎
   - 類別設計
   - 集合使用
   - 檔案操作

#### B5-2. 程式設計
   - OOP概念運用
   - 設計模式應用
   - 資料結構選擇

#### B5-3. 開發技能
   - 版本控制
   - 測試方法
   - 除錯技巧
