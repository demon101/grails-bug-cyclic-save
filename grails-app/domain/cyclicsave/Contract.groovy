package cyclicsave

import something.SomethingStatus

class Contract {
    Something something
    OfferBase offer

    static constraints = {
    }


    def beforeUpdate(){
        updateFields()

        if (isDirty('status')){
            something.status = SomethingStatus.PASSIV
            something.save() // cycle happens in this line
        }
        //must return true to save!
        return true
    }

    private updateFields() {

        if (isDirty('status')) {
            Contract.withNewSession {
                //some logic with another contract. I have checked. No data modification in this branch during StackOverflow Error
            }
        }
    }
}
