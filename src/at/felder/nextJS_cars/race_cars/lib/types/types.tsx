export interface Motor {
  serial: number;
  hp: number;
}

export interface Car {
  name: string;
  type: string;
  color: string;
  motor: Motor;
}
