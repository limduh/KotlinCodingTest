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
    val burnOrder = generateRandomBurnOrder(teams.size)

    // 총 4번의 불침번
    repeat(4) { round ->
        println("======== ${round + 1}번째 불침번 ========")
        for (i in teams.indices) {
            val team = teams[(i + round) % teams.size]
            val burnMember = team[burnOrder[i]]
            println("${team[0].name} vs ${team[1].name} : $burnMember 불침번!")
        }
    }
}

fun generateRandomTeams(members: List<Member>): List<List<Member>> {
    val shuffledMembers = members.shuffled()
    val teams = mutableListOf<List<Member>>()

    for (i in 0 until shuffledMembers.size step 2) {
        teams.add(listOf(shuffledMembers[i], shuffledMembers[i + 1]))
    }

    return teams
}

fun generateRandomBurnOrder(teamCount: Int): List<Int> {
    return (0 until teamCount).shuffled()
}

