package com.example.er.Search.Input.BaseInput

interface IBaseInput {
    fun open():             Boolean
    fun close()
    fun setDataInputListener(listenerData: IDataInputListener)
}