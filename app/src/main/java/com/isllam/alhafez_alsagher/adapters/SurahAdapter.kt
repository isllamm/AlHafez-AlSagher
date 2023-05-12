package com.isllam.alhafez_alsagher.adapters

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.isllam.alhafez_alsagher.databinding.ItemSurahBinding
import com.isllam.alhafez_alsagher.pojo.Surah

class SurahAdapter(private val onItemClick: OnItemClick) :
    ListAdapter<Surah, SurahAdapter.SurahViewHolder>(COMPARATOR) {

    companion object {
        private val COMPARATOR = object : DiffUtil.ItemCallback<Surah>() {
            override fun areItemsTheSame(oldItem: Surah, newItem: Surah) =
                oldItem.name == newItem.name

            override fun areContentsTheSame(oldItem: Surah, newItem: Surah) =
                oldItem == newItem
        }
    }

    class SurahViewHolder(val binding: ItemSurahBinding) :
        RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(surah: Surah) {
            binding.apply {
                name.text = surah.name
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SurahViewHolder {
        val binding = ItemSurahBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SurahViewHolder(binding)
    }

    override fun onBindViewHolder(holder: SurahViewHolder, position: Int) {
        val currentItem = getItem(position)
        if (currentItem != null) {
            holder.bind(currentItem)
            holder.itemView.setOnClickListener {
                onItemClick.onItemClickListener(currentItem)
            }
        }
    }

    interface OnItemClick {
        fun onItemClickListener(surah: Surah)
    }
}