## Usage
 ### コンテナ構築
```bash
  docker-compose up
```
### ファイル実行
  javacコマンドでコンパイル<br/>
  javaコマンドでバイナリファイル実行
```bash
  #コンテナに入って作業
    docker-compose run java /bin/bash
    javac Main.java 
    java Main
  #直接
    docker-compose run java javac Main.java
    docker-compose run java java Main
```
