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

    while (true) {
        println("원하는 메뉴를 선택해주세요")
        println("1.[햄버거 종류]")
        println("2.[사이드 메뉴]")
        println("3.[음료]")
        println("0.[종료]")


        val mymenu = readLine()!!.toInt()
        when (mymenu) {
            1 -> {
                println("[햄버거 메뉴]")
                println("1.치즈버거")
                println("2 불고기버거")
                println("3 새우버거")
                println("0.[처음으로 돌아가기]")
                println("메뉴를 선택해주세요.")
                val selectedmenu = readLine()!!.toInt()
            }



            2 -> {
                println("[사이드메뉴]")
                println("1.치킨텐더")
                println("2.통새우너겟")
                println("3. 치킨너겟")
                println("0.[처음으로 돌아가기]")
                println("메뉴를 선택해주세요.")
                val selectedmenu = readLine()!!.toInt()
            }


            3 -> {
                println("[음료]")
                println("1.콜라")
                println("2.마운틴듀")
                println("3.제로콜라")
                println("0.[처음으로 돌아가기]")
                println("메뉴를 선택해주세요.")
                val selectedmenu = readLine()!!.toInt()
            }

            0 -> {
                break
            }

        }


    }
}

