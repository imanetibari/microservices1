export class Terrain {
    private categorie_id: number;
    private id: number;
    private surface: number;
    private proprietairecin: string;

    constructor(categorie_id: number, id: number, surface: number, proprietairecin: string) {
        this.categorie_id = categorie_id;
        this.id = id;
        this.surface = surface;
        this.proprietairecin = proprietairecin;
    }

    // Getters
    public getCategorieId(): number {
        return this.categorie_id;
    }

    public getId(): number {
        return this.id;
    }

    public getSurface(): number {
        return this.surface;
    }

    public getProprietaireCin(): string {
        return this.proprietairecin;
    }

    // Setters
    public setCategorieId(value: number): void {
        this.categorie_id = value;
    }

    public setId(value: number): void {
        this.id = value;
    }

    public setSurface(value: number): void {
        this.surface = value;
    }

    public setProprietaireCin(value: string): void {
        this.proprietairecin = value;
    }
}
