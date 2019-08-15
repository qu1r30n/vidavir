package com.example.qu1r30n

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.example.qu1r30n.operadores_extra_globales.Producto_var
import kotlinx.android.synthetic.main.item_img_producto.view.*

class ProductosAdapter(private val mContext: Context, private val listaProductoVars: List<Producto_var>) : ArrayAdapter<Producto_var>(mContext, 0, listaProductoVars) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        val layout = LayoutInflater.from(mContext).inflate(R.layout.item_img_producto, parent, false)

        val producto = listaProductoVars[position]

        layout.txt_producto_list.text = producto.nombre
        layout.txt_precio_list.text = "$${producto.precio}"
        layout.img_producto_list.setImageResource(producto.imagen)
        //layout.img_producto_list2.setImageResource(producto.imagen)

        return layout
    }

}