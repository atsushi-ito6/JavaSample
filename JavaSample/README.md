javaSample
==========

JAVA関連のツールの動作確認を行うプロジェクト  

マークダウン記法参考URL  
---------------------------------
* <http://codechord.com/2012/01/readme-markdown/>  
* <http://takahashiyuya.hatenablog.com/entry/20120412/p1>  

junit  
---------------------------------
* jarダウンロード  
    * <https://github.com/junit-team/junit/wiki/Download-and-Install>  
* ビルドパス設定  
* テストソース、テストを作成して実行  
    * java.lang.NoClassDefFoundError: org/hamcrest/SelfDescribing発生  
        * junit4-11だとエラーがでるよう。4.10で実行するとOK  

maven  
---------------------------------
* mavanプロジェクトを作成  
    * pom.xmlに指定するだけでC:\Users\淳\.m2\repository配下に色々なjarを取得してくれる  
* pom.xml編集  
    * java 1,7  
    * junit 4.8.2  
* 参考URL  
    * Maven で Web アプリ用のプロジェクトを作成してからコーディングを着手するまでにやること  
        * <http://tomoyamkung.net/2013/07/13/java-maven-project-create/>  

jmockit  
---------------------------------
* pom.xml編集  
    * jmockit 1.9.5  

