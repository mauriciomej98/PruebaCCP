package com.example.prueba.ui.landing

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.prueba.R
import com.example.prueba.model.Person


class Adapter: RecyclerView.Adapter<Adapter.AdapterPerson>() {
   private var persons: List<Person> = listOf()

   override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AdapterPerson {
      return AdapterPerson.from(parent)
   }

   override fun getItemCount(): Int = persons.size


   override fun onBindViewHolder(holder: AdapterPerson, position: Int) {
      val person = persons[position]
      holder.bind(person)
   }

   fun setData(person: List<Person>) {
      this.persons = person
      notifyDataSetChanged()

   }

   class AdapterPerson(itemView: View) : RecyclerView.ViewHolder(itemView) {
      fun bind(persons: Person) {

         itemView.ftposter.text = persons.toString()
         itemView.vicopany.text = persons.toString()
         itemView.viuser.text = persons.toString()
      }


      companion object {
         fun from(parent: ViewGroup): AdapterPerson {
            val inflater = LayoutInflater.from(parent.context)
            val itemView = inflater.inflate(R.layout.item_person, parent, false)
            return AdapterPerson(itemView)


         }
      }
   }
}

