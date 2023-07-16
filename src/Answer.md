Class induk (super class) adalah Sepeda, sedangkan class turunan (subclass) adalah SepedaGunung.

Kalimat class SepedaGunung extends Sepeda memiliki maksud bahwa SepedaGunung merupakan sebuah subclass atau turunan dari superclass Sepeda. Dengan kata lain, SepedaGunung mewarisi atau memperluas (extends) fitur dan perilaku yang didefinisikan dalam Sepeda.
Dengan membuat SepedaGunung sebagai subclass dari Sepeda, kita dapat menggunakan dan memperluas fungsionalitas yang ada dalam Sepeda, serta menambahkan fitur-fitur khusus yang hanya dimiliki oleh sepeda gunung. Dalam konteks kode yang diberikan, SepedaGunung memiliki variabel dan metode tambahan seperti Shockbreaker, lampu, dan tempatMinum yang tidak ada dalam Sepeda.

Class SepedaGunung memiliki beberapa state/variabel berikut:
- Shockbreaker - Variabel ini menyimpan informasi tentang jenis shockbreaker yang dimiliki oleh sepeda gunung.
- lampu - Variabel ini menyimpan informasi tentang keberadaan lampu pada sepeda gunung.
- tempatMinum - Variabel ini menyimpan informasi tentang jumlah tempat minum yang ada pada sepeda gunung.
Dengan adanya state/variabel ini, class SepedaGunung memiliki tambahan informasi yang spesifik untuk sepeda gunung dan membedakannya dari class Sepeda yang merupakan superclass.

Class SepedaGunung memiliki beberapa behavior sebagai tambahan dari behavior yang diwarisi dari class Sepeda. Berikut adalah behavior yang dimiliki oleh class SepedaGunung:
- getShockbreaker() - Method ini digunakan untuk mengembalikan nilai shockbreaker yang dimiliki oleh sepeda gunung.
- getLampu() - Method ini digunakan untuk mengembalikan informasi tentang keberadaan lampu pada sepeda gunung.
- getTempatMinum() - Method ini digunakan untuk mengembalikan jumlah tempat minum yang ada pada sepeda gunung.
- setShockbreaker(int Shockbreaker) - Method ini digunakan untuk mengatur nilai shockbreaker pada sepeda gunung.
- setLampu(int lampu) - Method ini digunakan untuk mengatur informasi tentang keberadaan lampu pada sepeda gunung.
- setTempatMinum(int tempatMinum) - Method ini digunakan untuk mengatur jumlah tempat minum pada sepeda gunung.
Selain behavior tambahan ini, class SepedaGunung juga dapat menggunakan dan mengakses behavior yang diwarisi dari class Sepeda, seperti remSepeda(int nilaiPengereman) dan tambahKecepatan(int nilaiTambah).

Class SepedaGunung mewarisi beberapa state (variabel) dari class Sepeda. Berikut adalah state yang diturunkan dari class Sepeda:
- pedal - Variabel ini menyimpan informasi tentang jumlah pedal pada sepeda.
- gear - Variabel ini menyimpan informasi tentang jumlah gear pada sepeda.
- kecepatan - Variabel ini menyimpan informasi tentang kecepatan sepeda.
- standar - Variabel ini merupakan variabel private, yang hanya dapat diakses oleh class Sepeda dan tidak dapat diakses oleh class SepedaGunung.
Dengan mewarisi state ini, class SepedaGunung memiliki akses dan dapat mengakses nilai-nilai dari variabel-variabel tersebut, serta memanipulasinya sesuai kebutuhan.

Class SepedaGunung mewarisi beberapa behavior (metode) dari class Sepeda. Berikut adalah behavior yang diturunkan dari class Sepeda:
- remSepeda(int nilaiPengereman) - Method ini digunakan untuk mengurangi kecepatan sepeda dengan melakukan pengereman sesuai nilai yang diberikan.
- tambahKecepatan(int nilaiTambah) - Method ini digunakan untuk menambah kecepatan sepeda dengan menambahkan nilai yang diberikan.
Kedua behavior di atas dapat digunakan oleh objek SepedaGunung untuk mengendalikan kecepatan sepeda dan melakukan pengereman atau peningkatan kecepatan sesuai kebutuhan. Dengan mewarisi behavior ini, class SepedaGunung dapat memanfaatkannya tanpa perlu mendefinisikan ulang metode-metode tersebut.

Output:
Jumlah gear:1, Jumlah Pedal:2, kecepatan:40,Lampu:1, Shockbreaker:2

===================================================================

State (variabel) yang diwariskan dari class mobil ke class mobileTruck:
- Merek: Variabel private yang menyimpan informasi merek mobil.
- roda: Variabel private yang menyimpan jumlah roda mobil.
- kursi: Variabel private yang menyimpan jumlah kursi mobil.
- transmisi: Variabel private yang menyimpan tipe transmisi mobil.
Behavior (metode) yang diwariskan dari class mobil ke class mobileTruck:
- getMerek(): Metode public yang mengembalikan nilai merek mobil.
- setMerek(String Merek): Metode public yang mengatur nilai merek mobil.
- getKursi(): Metode public yang mengembalikan jumlah kursi mobil.
- setKursi(int kursi): Metode public yang mengatur jumlah kursi mobil.
- getRoda(): Metode public yang mengembalikan jumlah roda mobil.
- setRoda(int roda): Metode public yang mengatur jumlah roda mobil.
- getTransmisi(): Metode public yang mengembalikan tipe transmisi mobil.
- setTransmisi(int transmisi): Metode public yang mengatur tipe transmisi mobil.
Class mobileTruck mewarisi semua state dan behavior di atas dari class mobil dan juga memiliki state dan behavior tambahan yaitu:
- bakPasir: Variabel private yang menyimpan informasi kapasitas bak pasir pada truk.
- Gandengan: Variabel private yang menyimpan informasi jumlah gandengan pada truk.
- tampilkanTruck(): Metode public yang menampilkan informasi lengkap mengenai truk, termasuk merek, jumlah roda, tipe transmisi, kapasitas bak pasir, dan jumlah gandengan.

Output:
mobil dengan merk:HINO
mempunyai roda:4
transmisi:5
dilengkapi bak pasir:1
dilengkapi gandengan:1

Potongan kode super(Merek, roda, kursi, transmisi); pada konstruktor mobileTruck digunakan untuk memanggil konstruktor dari superclass yaitu mobil.
Dalam pewarisan class, subclass perlu menginisialisasi state yang diwarisi dari superclass-nya. Dalam hal ini, konstruktor mobileTruck perlu menginisialisasi state Merek, roda, kursi, dan transmisi yang berasal dari class mobil.
Dengan menggunakan super(Merek, roda, kursi, transmisi);, konstruktor mobileTruck akan memanggil konstruktor superclass mobil dan meneruskan nilai dari parameter Merek, roda, kursi, dan transmisi. Ini memastikan bahwa state yang diwarisi dari class mobil diinisialisasi dengan nilai yang sesuai saat objek mobileTruck dibuat.
Dengan memanggil konstruktor superclass menggunakan super(), kita dapat meneruskan argumen yang diperlukan untuk menginisialisasi state pada superclass sebelum melakukan inisialisasi state pada subclass. Ini membantu dalam memastikan bahwa objek subclass memiliki semua state yang diperlukan dan dapat bekerja dengan benar.

Potongan kode System.out.println("mobil dengan merk:" + super.getMerek()); pada method tampilkanTruck() digunakan untuk mencetak informasi merek mobil dari superclass mobil.
Dalam class mobileTruck, terdapat method tampilkanTruck() yang bertujuan untuk menampilkan informasi lengkap tentang truk, termasuk informasi yang diwarisi dari superclass mobil. Dalam hal ini, potongan kode super.getMerek() digunakan untuk mengakses metode getMerek() dari superclass mobil dan mendapatkan nilai merek mobil.
Dengan menambahkan "mobil dengan merk:" sebelum mencetak nilai merek mobil, potongan kode ini akan mencetak pesan yang memberikan informasi konteks, yaitu "mobil dengan merk:" diikuti dengan nilai merek mobil yang diperoleh dari superclass.
Dengan demikian, potongan kode ini akan mencetak pesan yang menggambarkan merek mobil dari objek mobileTruck yang saat ini sedang ditampilkan.

