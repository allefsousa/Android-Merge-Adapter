package com.developer.allef.boilerplateapp.adapter

import com.developer.allef.boilerplateapp.data.feiraLivre

/**
 * @author allef.santos on 16/05/20
 */

object DataSource {
    fun getFeira(): List<feiraLivre> {
        return listOf<feiraLivre>(
            feiraLivre("Alface",5.0,"https://cdnstatic8.com/freshorganicos.com.br/wp-content/uploads/2015/09/FRESH_ImagemPadrao_HortiFruti_Verduras_3_600x600.png"),
            feiraLivre("Tomate",5.0,"https://belezaesaude.com/i/730/56/tomate.jpg"),
            feiraLivre("Maça",5.0,"https://d26lpennugtm8s.cloudfront.net/stores/746/397/products/maca-argentina1-a86acef532d11addf315221676880019-480-0.jpg"),
            feiraLivre("Uva",5.0,"https://diariodocomercio.com.br/wp-content/uploads/2018/08/Uvas.jpg"),
            feiraLivre("Pastel",5.0,"https://img.estadao.com.br/fotos/crop/600x400/resources/jpg/8/3/1473369914238.jpg"),
            feiraLivre("Garapa",5.0,"https://http2.mlstatic.com/engenho-manual-de-fazer-garapa-caldo-de-cana-frete-gratis-D_NQ_NP_943184-MLB30922571845_062019-F.jpg"),
            feiraLivre("Batata",5.0,"https://cdn.garciasupermercados.com.br/media/catalog/product/cache/1/image/1000x1000/17f82f742ffe127f42dca9de82fb58b1/p/r/produto_341_batata_inglesa_copy_.jpg")
        )
    }
}