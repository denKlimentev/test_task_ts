# testst
task for Prior 


docker + jenkins local
установка докера
docker pull jenkins/jenkins
docker run -p 8080:8080 --name=jenkins-master jenkins/jenkins



остановить все docker stop $(docker ps -a -q)



Описание
1. для selenide синглТон не делаеться т.к. теряеться смысл selenide.
Но поля  настрояк в селениде статик, от сюда вытикает некоторые затруднения в реализации простых задач,
 т.к. запуск с нескольких хромоф в многопоточном режиме, я решил этот вопрос используя симафор, но можно
 было и статик синхранайз, разницы нет. т.к. это костыль, для большого проекта все равно нужно будет делать класс лоудер
 Для тестого задания это лишнее.

2. Я запустил локально селениум Грид, и Дженкисн
https://drive.google.com/drive/folders/1aUBRywXmzvLb95DlrPjd9whK8Otx7LXl
т.к. для тестого задания сервера не выделены. В боевых условиях настройку нужно будет воспроизводить на линукс серверах
так же подключил Алюр, но без кастомизации, опять же для тестого задания это не нужно. И при настройке боевого проекта
нуно будет читать доки по Селениду т.к. в селениде не предусмотрен логир и листнер, что затруднит костомизацию, но
вроде как на офф сайте там есть какие то решения этой задачи, надо будет смотреть

3. При разворачивании проекта на силиниде придется все равно писать обвертки, так как там есть ряд вещей ограничивающий
работу с ним такие как, наприпер, состовной метод из двух локаторов, второй локатор передается как стринга и только css селектор
что весьма не удобно и Пэйдж Обжетк становится не совсем каконичным


4. Написали пару простейших кейсов. и Запустил их в двух брайзерах
IE морально усторел (даже на моем текущем проекте которому 8 лет, от IE отказались 6 лет назад, даже учитывая что все клиенты
все равно продолжают работать на IE связано это с тем то майкрасовт не потдерживает IE. И работа с ним сущий адд,
что трудо емко и, вытикающее, дорго)
Microsoft Edge - не поднимался, примерно с тех же соображений


5. Для Selenide в место maven, возможно обдумать использование gradle.

6. При выборе обратите внимание на Kotlin может он больше понравится
