package com.example.newkiosk

//메뉴판
//대분류:버거 사이드 음료
//버거 -> 치즈 불고기 새우
//사이드-> 치킨텐더,통새우너겟,치킨너겟
//음료->콜라, 마운틴듀, 제로콜라
//1.치즈버거,불고기버거,새우버거 when조건문 으로 처음으로 되돌아가기
//4.주문 메뉴 확인 / 처음으로 되돌아가기
//5.결제해주세요. -카드,현금
//6."결제가완료되었습니다." / "결제가 취소되었습니다. 처음으로" 3000원 이하는 결제할 수 없음. 다 통과 후
//7.주문하신 메뉴를 확인해주세요. 선택한 메뉴 맞는지 금액 확인
//8.감사합니다. 맛있게 드세요.

fun main() {
    var chesseBurger = Food("치즈버거",8.9, "berger", "입안가득 고소한풍미와 소고기육즙가득한 햄버거")
    var bullBurger = Food("불고기버거",9.9, "berger", "아삭한 양배추와 건강한 우리 한우로 만든 불고기버거")

    while (true) {
        println("원하는 메뉴를 선택해주세요")
        println("1.[햄버거 종류| 앵거스 비프 통살을 다져만든 버거]")
        println("2.[사이드 메뉴| 겉바속촉 튀김메뉴]")
        println("3.[음료 | 얼음동동 청량감 가득 음료]")
        println("0.[종료]")


        val mymenu = readLine()!!.toInt()
        when (mymenu) {
            1 -> {
                println("[햄버거 메뉴]")
                println("1.치즈버거 | 입안가득 고소한풍미와 소고기육즙가득한 햄버거 | W 8.9 ")
                println("2 불고기버거| 아삭한 양배추와 건강한 우리 한우로 만든 불고기버거 |W 9.9 ")
                println("3 새우버거  | 오동통한 새우가 가득한 식감이 살아있는 새우햄버거 |W 8.9 ")
                println("0.종료 | [처음으로 돌아가기]")
                println("메뉴를 선택해주세요.")
                val selectedmenu = readLine()!!.toInt()
            }


            2 -> {
                println("[사이드메뉴]")
                println("1.치킨텐더 | 겉바속촉 갓 튀겨낸 치킨텐더 | 5.9")
                println("2.통새우너겟 |새우식감이 살아 움직이는 통새우너겟 | 4.9원")
                println("3. 치킨너겟 | 다리살로만 만든 잘튀긴 치킨너겟 | 5.9원")
                println("0.종료 | [처음으로 돌아가기]")
                println("메뉴를 선택해주세요.")
                val selectedmenu = readLine()!!.toInt()
            }


            3 -> {
                println("[음료]")
                println("1.각얼음 동동 콬카콜라 | W.2.5")
                println("2.각얼음 동동 마운틴듀| W.2.5")
                println("3.제로칼로리 제로콜라| W.2.5")
                println("0.종료 | [처음으로 돌아가기]")
                println("메뉴를 선택해주세요.")
                val selectedmenu = readLine()!!.toInt()
            }

            0 -> {
                break
            }

        }


    }
}

