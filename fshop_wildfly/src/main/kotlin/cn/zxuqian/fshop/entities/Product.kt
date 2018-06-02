package cn.zxuqian.fshop.entities

import javax.persistence.*

@Entity
@Table(name = "product")
//@JsonIgnoreProperties("name", allowSetters = true)
data class Product(
        @Id
        @GeneratedValue
        var id: Long = 0,
        var name: String,
        var price: Double,
        var Description: String,
        @ManyToMany(fetch = FetchType.EAGER)
        @JoinTable(name = "product_catalog")
        var catalogs: List<Catalog>,
        //@Enumerated(EnumType.ORDINAL)
        var status: Status = Status.ACTIVE
)