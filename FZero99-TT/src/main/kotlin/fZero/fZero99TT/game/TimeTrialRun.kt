package fZero.fZero99TT.game

import jakarta.persistence.*

@Entity
@Table(name = "times")
class TimeTrialRun (
    @Column(nullable = false)
    val track: String,
    @Column(nullable = false)
    val totalTime: Double,
    @Column
    val round1: Double,
    @Column
    val round2: Double,
    @Column
    val round3: Double,
    @Column
    val round4: Double,
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,
)