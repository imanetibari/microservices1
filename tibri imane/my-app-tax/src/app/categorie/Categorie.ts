export class Categorie {
    public _id: number;
    public _type: string;
  
    constructor(id: number, type: string) {
      this._id = id;
      this._type = type;
    }
  
    // Getters
    get id(): number {
      return this._id;
    }
  
    get type(): string {
      return this._type;
    }
  
    // Setters
    set id(value: number) {
      this._id = value;
    }
  
    set type(value: string) {
      this._type = value;
    }
  }
  