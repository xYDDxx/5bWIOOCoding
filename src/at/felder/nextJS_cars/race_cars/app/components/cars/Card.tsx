import { Car } from "@/lib/types/types";
import React from "react";

type Props = { car: Car };

export default function Card({ car }: Props) {
  return (
    <div className="bg-gray-800 border border-gray-700 p-6 rounded-2xl shadow-lg text-white">
      <h2 className="text-2xl font-bold mb-2">{car.name}</h2>
      <p className="text-lg font-semibold text-blue-400 uppercase tracking-wide">
        {car.type}
      </p>
      <div className="mt-2 text-gray-300">
        <p>
          <span className="font-semibold text-gray-400">Color:</span>{" "}
          {car.color}
        </p>
        <p>
          <span className="font-semibold text-gray-400">HP:</span>{" "}
          {car.motor.hp} HP
        </p>
        <p className="text-sm text-gray-500">
          <span className="font-semibold text-gray-400">Serial:</span>{" "}
          {car.motor.serial}
        </p>
      </div>
    </div>
  );
}
