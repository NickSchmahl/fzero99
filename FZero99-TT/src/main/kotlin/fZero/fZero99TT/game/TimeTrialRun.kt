package fZero.fZero99TT.game

import jakarta.persistence.*
import org.hibernate.annotations.GenericGenerator

@Entity
@Table(name = "times")
class TimeTrialRun (
    @Column(nullable = false)
    @Enumerated(EnumType.STRING)
    val track: FZeroTrack,
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
    @GeneratedValue(generator = "randomGenerator")
    @GenericGenerator(name = "randomGenerator", strategy = "fZero.fZero99TT.repository.MyGenerator")
    val id: Long? = null,
)