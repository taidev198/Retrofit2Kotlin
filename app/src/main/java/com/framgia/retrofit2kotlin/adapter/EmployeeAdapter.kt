package com.framgia.retrofit2kotlin.adapter

import android.content.Context
import android.databinding.DataBindingUtil

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import com.framgia.retrofit2kotlin.R
import com.framgia.retrofit2kotlin.databinding.EmployeeItemBinding
import com.framgia.retrofit2kotlin.model.Employee
import java.util.logging.Logger

/**
 * Created by superme198 on 03,May,2019
 * in NotesMVVM.
 *binding adapter:https://www.androidhive.info/android-databinding-in-recyclerview-profile-screen/
 */
class EmployeeAdapter(var context: Context) : RecyclerView.Adapter<EmployeeAdapter.NoteViewHolder>() {

    var notes: List<Employee> = ArrayList()

    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): NoteViewHolder {
        val binding: EmployeeItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(context), R.layout.employee_item, p0, false)
            return NoteViewHolder(binding.root, binding)
    }

    override fun getItemCount(): Int {

        return if(notes.isNullOrEmpty()) 0 else notes.size

    }

    override fun onBindViewHolder(viewHolder: NoteViewHolder, pos: Int) {
        viewHolder.binding.item = notes[pos]
        viewHolder.binding.executePendingBindings()
    }

    internal fun setNotes(listNotes: List<Employee>) {
        notes = listNotes
    }

    class NoteViewHolder(
        item: View,
        var binding: EmployeeItemBinding
    ) : RecyclerView.ViewHolder(item) {

        fun bindData(note: Employee) {
            binding.item = note
        }
    }
}