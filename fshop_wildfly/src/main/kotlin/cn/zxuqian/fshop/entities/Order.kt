package cn.zxuqian.fshop.entities

import javax.persistence.*

@Entity
@Table(name = "order_table")
data class Order (
        @Id
        @GeneratedValue
        var id: Long,
        var orderId: String,
        var priceTotal: Double,
        //cascade = [CascadeType.PERSIST, CascadeType.MERGE]
        @ManyToMany
        @JoinTable(name = "order_product")
        var products: List<Product>,
        @ManyToOne
        var user: User,
        var status: Status = Status.ACTIVE
)