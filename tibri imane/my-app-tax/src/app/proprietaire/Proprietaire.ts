export class Proprietaire {
    private _id: number;
    private _cin: string;
    private _nom: string;
    private _password: string;
    private _prenom: string;
  
    constructor(id: number, cin: string, nom: string, password: string, prenom: string) {
      this._id = id;
      this._cin = cin;
      this._nom = nom;
      this._password = password;
      this._prenom = prenom;
    }
  
    // Getters
    get id(): number {
      return this._id;
    }
  
    get cin(): string {
      return this._cin;
    }
  
    get nom(): string {
      return this._nom;
    }
  
    get password(): string {
      return this._password;
    }
  
    get prenom(): string {
      return this._prenom;
    }
  
    // Setters
    set id(value: number) {
      this._id = value;
    }
  
    set cin(value: string) {
      this._cin = value;
    }
  
    set nom(value: string) {
      this._nom = value;
    }
  
    set password(value: string) {
      this._password = value;
    }
  
    set prenom(value: string) {
      this._prenom = value;
    }
  }
  