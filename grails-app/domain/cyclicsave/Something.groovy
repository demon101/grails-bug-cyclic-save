package cyclicsave

import something.SomethingStatus

class Something {
    String data

    SomethingStatus status = SomethingStatus.ACTIVE

    static hasMany = [offers: Offer]

    static constraints = {
    }
}
