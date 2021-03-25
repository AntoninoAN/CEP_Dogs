package com.example.cepdog.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.cepdog.R

class DogAdapter(private val dataSet: List<String>) :
        RecyclerView.Adapter<RecyclerView.ViewHolder>() {
//Multiple VH
// DIff behaviour for the same Adapter. (State Successful, State Offline)

    class DogViewHolder(val dogView: View) :
            RecyclerView.ViewHolder(dogView) {
        private val dogImageView: ImageView = dogView.findViewById(R.id.iv_dog_face)

        fun onBind(dogItem: String) {
            Glide.with(dogView.context).load(dogItem).into(dogImageView)
        }
    }

    class DogNoDataViewHolder(val noDataView: View) : RecyclerView.ViewHolder(noDataView) {
        private val tvNoData: TextView = noDataView.findViewById(R.id.tv_no_data)
    }

    /**
     * Return NoDataVH when dataSEt is empty
     * else return DogVH
     */
    override fun getItemViewType(position: Int): Int {
        super.getItemViewType(position)
        return dataSet.size // n or 0
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return when (viewType) {
            0 -> {
                DogNoDataViewHolder(LayoutInflater.from(parent.context).inflate(
                        R.layout.offline_data,
                        parent,
                        false
                ))
            }
            else ->
                DogViewHolder(
                    LayoutInflater.from(parent.context).inflate(
                            R.layout.item_layout,
                            parent,
                            false
                    )
            )
        }
    }

    override fun getItemCount(): Int {
        return dataSet.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is DogViewHolder->{
                holder.onBind(dataSet[position])
            }
            is DogNoDataViewHolder->{

            }
        }
    }
}

