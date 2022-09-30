# Aktivite Yaşam Döngüsü

&nbsp; &nbsp; **Aktivite yaşam döngüsü**; kullanıcı uygulamada gezinirken, uygulamadan çıkarken ve uygulamaya geri dönerken oluşan farklı durumları yönetmemizi sağlayan yapıdır. 
Örneğin, yaşam döngüsü geri aramalarının iyi bir şekilde uygulanması, uygulamanızın şunlardan kaçınmasını sağlamaya yardımcı olabilir:
- Kullanıcı, uygulamanızı kullanırken bir telefon araması alırsa veya başka bir uygulamaya geçerse çökme. 
- Kullanıcı aktif olarak kullanmadığında değerli sistem kaynaklarını tüketmek. 
- Uygulamanızdan ayrılıp daha sonra geri dönerse kullanıcının ilerlemesini kaybetmek. 
- Ekran yatay ve dikey yön arasında döndüğünde kullanıcının ilerlemesinin çökmesi veya kaybolması.

---
<img src="https://user-images.githubusercontent.com/78666794/193258383-b6f81251-f22e-466c-af00-60f15d14e2fa.png" alt="drawing" width="500"/>

---
***onCreate();***
<br>
Bir aktivite başlatıldığında arka planda devreye giren ilk metodumuz *onCreate()*’tir. 
Uygulama açıldığı zaman aktivitenin gerçekleştirmesini istediğimiz her olayı *onCreate()* metodunda yazarız. 
Bu işlemler sadece bir kez gerçekleştirilir, aktivite silinmediği müddetçe bir daha *onCreate()* metodu çalıştırılmaz.
<br><br>

***onStart();***
<br>
*onCreate(*) metodundan sonra veya aktivite tekrar çağrıldıktan sonra devreye *onStart()* metodu girer. 
Bu metod ile aktivitenin arayüzü kullanıcıya görünür hale gelir.
<br><br>

***onResume();***
<br>
Aktivite durdurulduktan sonra tekrar aynı ekrana gelindiğinde devreye *onResume()* metodu girer. 
Aktivite çalıştırılmadan önceki son metod budur. 
Bundan sonra yazılan koda göre diğer metodlar devreye girer.
<br><br>

***onPause();***
<br>
Aktivite arka plana geçtiği zaman *onPause()* metodu başlar. 
Arka planda çalıştırılacak bir animasyon da *onCreate()* metodunda değil *onPause()* metodunda yazılmalıdır. 
Eğer *onCreate()* içerisinde yazılırsa, aktivite tekrar ön plana alındığında animasyon çalışmaz.
<br><br>

***onStop();***
<br>
*onPause()* metodundan sonra çalışır. Aktivite arka plana atıldıktan sonra gerçekleşebilecek iki ihtimal vardır: 
ya kullanıcının aktiviteye tekrar dönmesi ya da aktivitenin tamamen sonlanması. 
Kullanıcı geri geldiğinde uygulama *onStart()* metodundan itibaren yeniden çalıştırılır. 
Eğer aktivite sonlandıysa da devreye *onDestroy()* metodu girer. 
<br><br>

***onDestroy();***
<br>
Aktivite tamamen yok edilir ve yaşam döngüsü tamamlanır.

---
<br>

&nbsp; &nbsp; Bir kullanıcı, bir etkinliğin UI durumunun, döndürme veya çoklu pencere moduna geçme gibi bir yapılandırma değişikliği boyunca aynı kalmasını bekler. Ancak, böyle bir yapılandırma değişikliği meydana geldiğinde sistem varsayılan olarak etkinliği yok eder ve etkinlik örneğinde depolanan tüm UI durumunu siler. Benzer şekilde, bir kullanıcı, geçici olarak uygulamanızdan farklı bir uygulamaya geçip daha sonra uygulamanıza geri dönerse, kullanıcı arayüzü durumunun aynı kalmasını bekler. Ancak sistem, kullanıcı uzaktayken ve etkinliğiniz durdurulduğunda uygulamanızın sürecini bozabilir.
<br><br><br>
&nbsp; &nbsp; Bir aktivite diğerine başladığında, ikisi de yaşam döngüsü geçişleri yaşarlar. İlk aktivite çalışmayı durdurur ve diğer aktivite oluşturulurken Duraklatıldı veya Durduruldu durumuna girer. Bu etkinliklerin diske veya başka bir yere kaydedilmiş verileri paylaşması durumunda, ilk etkinliğin ikincisi oluşturulmadan önce tamamen durdurulmadığını anlamak önemlidir. Aksine, ikincisini başlatma süreci, birinciyi durdurma süreciyle örtüşür.
