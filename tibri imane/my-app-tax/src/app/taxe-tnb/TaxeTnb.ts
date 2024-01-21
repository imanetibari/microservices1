export class TaxeTnb {
    private _categorie_id: number;
    private _montant: number;
    private _taux_id: number;
    private _terrain_id: number;
    private _year: number;
    private _id: number;
    private _description: string;
    private _label: string;
    private _proprietairecin: string;
  
    constructor(
      categorie_id: number,
      montant: number,
      taux_id: number,
      terrain_id: number,
      year: number,
      id: number,
      description: string,
      label: string,
      proprietairecin: string
    ) {
      this._categorie_id = categorie_id;
      this._montant = montant;
      this._taux_id = taux_id;
      this._terrain_id = terrain_id;
      this._year = year;
      this._id = id;
      this._description = description;
      this._label = label;
      this._proprietairecin = proprietairecin;
    }
  
    // Getters
    get categorie_id(): number {
      return this._categorie_id;
    }
  
    get montant(): number {
      return this._montant;
    }
  
    get taux_id(): number {
      return this._taux_id;
    }
  
    get terrain_id(): number {
      return this._terrain_id;
    }
  
    get year(): number {
      return this._year;
    }
  
    get id(): number {
      return this._id;
    }
  
    get description(): string {
      return this._description;
    }
  
    get label(): string {
      return this._label;
    }
  
    get proprietairecin(): string {
      return this._proprietairecin;
    }
  
    // Setters
    set categorie_id(value: number) {
      this._categorie_id = value;
    }
  
    set montant(value: number) {
      this._montant = value;
    }
  
    set taux_id(value: number) {
      this._taux_id = value;
    }
  
    set terrain_id(value: number) {
      this._terrain_id = value;
    }
  
    set year(value: number) {
      this._year = value;
    }
  
    set id(value: number) {
      this._id = value;
    }
  
    set description(value: string) {
      this._description = value;
    }
  
    set label(value: string) {
      this._label = value;
    }
  
    set proprietairecin(value: string) {
      this._proprietairecin = value;
    }
  }
  