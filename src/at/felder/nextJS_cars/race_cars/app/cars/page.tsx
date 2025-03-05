import React from "react";
import Card from "../components/cars/Card";
import { Car } from "@/lib/types/types";

type Props = {};

const cars: Car[] = [
  {
    name: "Rotary Beast",
    type: "Mazda RX7",
    color: "red",
    motor: {
      serial: 23904203,
      hp: 700,
    },
  },
  {
    name: "Prancing Thunder",
    type: "Ferrari F8 Tributo",
    color: "red",
    motor: {
      serial: 10293847,
      hp: 710,
    },
  },
  {
    name: "Silver Bullet",
    type: "Mercedes-AMG GT",
    color: "black",
    motor: {
      serial: 29384756,
      hp: 720,
    },
  },
  {
    name: "Bavarian Rocket",
    type: "BMW M4 G82",
    color: "blue",
    motor: {
      serial: 38475692,
      hp: 503,
    },
  },
  {
    name: "Lambo Vortex",
    type: "Lamborghini Huracán EVO",
    color: "green",
    motor: {
      serial: 84756392,
      hp: 640,
    },
  },
  {
    name: "Turbo Phantom",
    type: "Porsche 911 Turbo S",
    color: "silver",
    motor: {
      serial: 56473829,
      hp: 640,
    },
  },
];

export default function Page({}: Props) {
  return (
    <div className="bg-black min-h-screen p-6 overflow-hidden">
      <h1 className="text-white text-3xl font-bold mb-6 text-center">Cars</h1>
      <div className="grid grid-cols-1 md:grid-cols-2 gap-6 max-w-4xl mx-auto">
        {cars.map((car: Car, index) => (
          <Card key={index} car={car} />
        ))}
      </div>
    </div>
  );
}
