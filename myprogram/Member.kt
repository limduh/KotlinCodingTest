package myprogram

data class Member(val name: String)

fun main() {
    // 8명의 맴버 생성
    val members = listOf(
        Member("안유진"), Member("보영누나"), Member("세정이"), Member("릴카누나"),
        Member("워윅"), Member("냥뇽녕냥"), Member("쵸단"), Member("문월")
    )

    // 팀 구성 및 불침번 순서 랜덤 설정//
    val teams = generateRandomTeams(members)

    println("불침번 순서 및 조원  $teams")
}

fun generateRandomTeams(members: List<Member>): List<List<Member>> {
    val shuffledMembers = members.shuffled()
    val teams = mutableListOf<List<Member>>()

    for (i in 0 until shuffledMembers.size step 2) {
        teams.add(listOf(shuffledMembers[i], shuffledMembers[i + 1]))
    }

    return teams
}


