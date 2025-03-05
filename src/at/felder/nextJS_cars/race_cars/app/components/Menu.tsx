import Link from "next/link";
import React from "react";

type Props = {};

export default function Menu({}: Props) {
  return (
    <div>
      <ul className="flex justify-center text-2xl font-bold">
        <li className="pr-4 hover:cursor-pointer hover:text-gray-300">
          <Link href="/">Home </Link>
        </li>
        <li className="pr-4 hover:cursor-pointer hover:text-gray-300">
          <Link href="/cars">Cars</Link>
        </li>
        <li className="hover:cursor-pointer hover:text-gray-300">
          <Link href="/bikes">Bikes</Link>
        </li>
      </ul>
    </div>
  );
}
