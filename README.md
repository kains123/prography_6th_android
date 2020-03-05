# prography_6th_android


## 1.ViewPager를 이용하여 Fragment 3개를 연결한, Swipe가 가능한 Bottom Navigation View 구현


Screeenshots
____________

<div>


<img with="200" src="https://user-images.githubusercontent.com/48613533/75983398-d5989300-5f2b-11ea-8483-3899eee6e232.jpeg">

<img with="200" src="https://user-images.githubusercontent.com/48613533/75983453-eba65380-5f2b-11ea-8dbc-175852c75741.jpeg">

<img with="200" src="https://user-images.githubusercontent.com/48613533/75983534-11cbf380-5f2c-11ea-8495-56ee8dd8c691.jpeg">

</div>


## 2.URL에서 JSON 형식의 정보를 받아온 후(GET) 표시할 정보는 번호(1~ 20), title(제목), director(감독), release_date(출시년도)이다.

### 두번째 fragment에 recyclerview를 넣으려고 했으나 계속 알수없는 오류가 생겼고 해결하지 못해 MainActivity에 recyclerView를 배치하였다.
### 주어진 json을 volley, gson을 이용해 parsing하였다.
* 스크롤 가능하게 배치
* 모든 Activity 생성할 때, Empty Activity를 이용해 작성하였다.


