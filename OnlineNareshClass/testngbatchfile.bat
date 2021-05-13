set projectLocation=C:\Users\Lenovo\git\Sudha\OnlineNareshClass
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\testng.xml
pause