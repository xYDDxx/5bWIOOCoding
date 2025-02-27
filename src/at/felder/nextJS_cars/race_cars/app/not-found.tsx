import React from "react";

type Props = {};

export default function NotFound({}: Props) {
  return (
    <div className="flex justify-center align-middle text-red-600 text-9xl">
      <h1>WRONG ROUTE</h1>
    </div>
  );
}
