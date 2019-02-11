package net.print.kt03

/**
 * q_e_t_y_ue_h_cvu_1_5
 */
fun main(vararg args: String) {

    args.flatMap {

        it.split("_")
    }.map {
        print("$it ")
    }

}