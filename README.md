# CalmOwlNewsReader

Description 
====
A news reader app using News API with Firebase user and google Authentication


Screenshots
====
- Splash screen

![image](https://user-images.githubusercontent.com/47298653/140940608-73736764-7651-4371-a86b-7094f839a542.png)


- Log in 

![image](https://user-images.githubusercontent.com/47298653/140940489-5751cfc7-4a16-4ca6-a7ea-e3ed38dd817f.png)


- Register

![image](https://user-images.githubusercontent.com/47298653/140940681-924ff4a1-bed8-479f-9987-07d5ffe0d0fd.png)


- Main Page

![image](https://user-images.githubusercontent.com/47298653/140945215-9fe22fdd-5a3d-45c4-8065-fe73f85a2451.png)



Members
====
1. Lê Việt Anh
2. Đỗ Thành Đạt
3. Trần Bảo Huy
4. Nguyễn Tự Tùng
5. Vũ Tuấn Phương Nam


Functionalities
====
- Fetch articles from News API using retrofit.
- Swipe to refresh.
- Search bar: look for an article with keyword.
- Detailed page corresponding to each news headline.
- User and Google Authentication with Firebase.
- Splash screen: display page while waiting for the app to boot.

Future Improvements
====
- Bottom navigation with different categories
- User profile page


Explannations 
====

1. Adapter.java
Content filler, takes 2 args: context (MainActivity.this here), List


2. articles
object of List<Articles>, or a list of Articles objects, each contains info relating to an article.


3. ApiInterface.java
Constructs URL with appended paramenters.


4. ApiClient.java
Implements retrofit to interact with newsapi, uses URL constructed by ApiInterface.java


5. Retrofit
Retrofit is a type-safe REST client for Android, Java and Kotlin developed by Square. 
The library provides a powerful framework for authenticating and interacting with APIs 
and sending network requests with OkHttp.
