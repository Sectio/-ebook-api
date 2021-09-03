<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class AuthController extends Controller
{
    public function me(){
        return[
            'nis'=>3103119175,
            'name'=>'Sectio',
            'phone'=>'081823701542',
            'class'=>'XII RPL 6'
        ];
    }
}